
public class DaoFactory {
    private static Cats catsDao;
//    private static Dogs dogsDao;

    public static Cats getCatsDao() {
        if (catsDao == null) {
            catsDao = new CatHerder();
        }
        return catsDao;
    }


}
