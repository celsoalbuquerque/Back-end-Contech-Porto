public class Program {
    public static void main(String[] args) {

        /*PARÂMETROS */
        Candidato c1 = new Candidato("Celso Albuquerque", "celsoalbuquerquee@gmail.com", "Branco",'M', null);
        c1.status();

        Candidato c2 = new Candidato("Andre Vinícius", "andrevinicius@gmail.com", "Negro", 'm', null);
        c2.status();

        Candidato c3 = new Candidato("Victória Farias", "victpriafarias@gmail.com", "Branca", 'F', null);
        c3.status();
    }
}
