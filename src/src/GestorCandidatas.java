import java.util.ArrayList;

public class GestorCandidatas {

    //Array list
    private ArrayList<Candidata> listaCandidatas;

    public GestorCandidatas() {
        this.listaCandidatas = new ArrayList<>();
    }

    public void registrarCandidatas(Candidata candidata){
        listaCandidatas.add(candidata); //Añadimos la candidata a la lista
        System.out.println("Candidata registrada correctamente!");

    }

}
