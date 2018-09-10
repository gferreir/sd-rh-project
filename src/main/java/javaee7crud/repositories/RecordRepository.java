package javaee7crud.repositories;

import javaee7crud.entities.Record;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RecordRepository {
    public void create(Record r);
    public void delete(int id);
    public void updateContent(int id, String content);
    public List<Record> getAll();
}
