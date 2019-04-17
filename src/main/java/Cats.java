import java.util.List;

public interface Cats {

    List<Cat> getAllCats(); // find all the ads records
    Cat getCat(int id); // find an individual record by it's id
    void addCat(Cat cat); // insert a new record
    void addCat(String name, int age, String picture);
    void updateCat(Cat cat); // update an existing record
    void humanelyEuthenize(Cat cat); // remove a record

}
