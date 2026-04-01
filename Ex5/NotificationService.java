public class NotificationService {

    public void notificar(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }
}