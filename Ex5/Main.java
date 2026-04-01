public class Main {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.notificar(new NotificacaoEmail(), "Olá por email");
        service.notificar(new NotificacaoSMS(), "Olá por SMS");
        service.notificar(new NotificacaoPush(), "Olá por push");
    }
}