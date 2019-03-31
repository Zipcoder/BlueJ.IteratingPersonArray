 
import java.util.*;
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        Integer counter = 0;
        Integer lengthArr =  this.getPersonArray().length;
        while( counter < lengthArr ){
            result.append(this.getPersonArray()[counter]);
            counter++;
        }
        return result.toString();
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        Integer lengthArr =  this.getPersonArray().length;
        for( int i = 0; i < lengthArr; i++ ){
            result += this.getPersonArray()[i];
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for( Person s : this.getPersonArray() ){
            result += s;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
