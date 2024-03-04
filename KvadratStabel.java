
public class KvadratStabel {
    Node start;

    class Node{
        Kvadrat data;
        Node neste;

        Node(Kvadrat data){
            this.data = data;
        }
    }


    void leggPa(Kvadrat ny){
        if (erTom()){
            start = new Node(ny);
        } else{
            Node midl = start;
            start = new Node(ny);
            start.neste = midl;
        }

    }
    Kvadrat taAv(){
        if(erTom()){
            return null;
        } else{
            Node midl = start;
            start = start.neste;
            return midl.data;
        }

    }
    boolean erTom(){
        return start == null;
    }
    
}
