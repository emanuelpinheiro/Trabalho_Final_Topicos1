package br.unitins.topicos1.service;

import java.time.LocalDateTime;

import br.unitins.topicos1.dto.pedido.PedidoResponseDTO;
import br.unitins.topicos1.model.Pedido;
import br.unitins.topicos1.model.StatusPedido;
import br.unitins.topicos1.model.Usuario;
import br.unitins.topicos1.repository.PedidoRepository;
import br.unitins.topicos1.repository.UsuarioRepository;
import br.unitins.topicos1.validation.ValidationException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PagamentoServiceImpl implements PagamentoService {

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    PedidoRepository pedidoRepository;

    @Override
    @Transactional
    public PedidoResponseDTO realizarPagamento(String login, Long id) {

        Pedido pedido = pedidoRepository.findByIdLogado(login, id);

        boolean data = pedido.getVencimento().isBefore(LocalDateTime.now());

        if (pedido.getStatusPedido().equals(StatusPedido.PROCESSANDO)) {
            if (!data) {
                pedido.setStatusPedido(StatusPedido.PAGO);
            } else {
                pedido.setStatusPedido(StatusPedido.CANCELADA);
            }
        }
        else{
            throw new ValidationException("Pagamento",
                        "O pagamento já foi efetuado");
        }


        return PedidoResponseDTO.valueOf(pedido);

    }

    
}


    

