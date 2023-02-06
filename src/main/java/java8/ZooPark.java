package java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Shabdanov Ilim
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZooPark {
    private List<Animal> animals;
    private String name;
    private int age;


    public void getAnimalInfo(){
        System.out.println("name : "+getName());
        System.out.println("year : "+getAge());
        for (Animal b : this.animals) {
           b.getInfo();
        }
    }

    @Override
    public String toString() {
        return "\nZooPark  : " +
                "\nanimals  :" + animals +
                "\nname  :" + name +
                "\nage  :" + age +
                "\n=================\n";
    }
}
