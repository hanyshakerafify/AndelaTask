import java.io.IOException;

public class State {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        StateSearch stateSearch = new  StateSearch();
        String stateName = stateSearch.getStateByPostCode(33133);
        System.out.println("State name is : "+stateName);
    }
}
