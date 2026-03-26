package za.ac.cput.repository;
//Jada Rinquest 222871296
public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}

