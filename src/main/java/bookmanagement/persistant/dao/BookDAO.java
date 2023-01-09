package bookmanagement.persistant.dao;
import java.util.List;
import bookmanagement.persistant.dto.*;
public interface BookDAO {
public int insertData(BookDTO dto);
public int updateData(BookDTO dto);
public int deleteData(BookDTO dto);
public BookDTO selectOne(BookDTO dto);
public List<BookDTO> selectAll();
}
