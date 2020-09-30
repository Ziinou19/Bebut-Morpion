public class Gamer {

    package morpion;

    public class Player{

        private String name;
        private  int numero;

        public Player() {
            name = "prenom";
            numero = 1;
        }

        public Player(String prenom, int indentifiant) {

            this.name = prenom;
            this.numero = indentifiant;

        }

        public String getName()
        {
            return name;

        }

        public int getId()
        {
            return numero;

        }



        public void setName (String prenom)
        {
            this.name = prenom;

        }

        public void setId (int indentifiant)
        {
            this.numero = indentifiant;

        }




    }






