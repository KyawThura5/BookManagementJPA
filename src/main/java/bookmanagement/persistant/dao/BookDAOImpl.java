package bookmanagement.persistant.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import bookmanagement.persistant.dto.BookDTO;
import bookmanagement.service.JPAUtil;

public class BookDAOImpl implements BookDAO {
@Override
public int insertData(BookDTO dto) {
EntityManager em = null;
int result = 0;
try {
em = JPAUtil.getEntityManagerFactory().createEntityManager();
em.getTransaction().begin();
em.persist(dto);
em.getTransaction().commit();
result=1;
}
finally {
em.close();
}
return result;
}
@Override
public int updateData(BookDTO dto) {
EntityManager em = null;
int result = 0;
try {
em = JPAUtil.getEntityManagerFactory().createEntityManager();
em.getTransaction().begin();
em.merge(dto);
em.getTransaction().commit();
result = 1;
}
finally {
em.close();
}
return result;
}
@Override
public int deleteData(BookDTO dto) {
EntityManager em = null;
int result = 0;
try {
em = JPAUtil.getEntityManagerFactory().createEntityManager();
em.getTransaction().begin();
BookDTO outputDTO = em.find(BookDTO.class,

dto.getBookCode());

em.remove(outputDTO);
em.getTransaction().commit();
result = 1;
}
finally {
em.close();
}
return result;
}
@Override
public BookDTO selectOne(BookDTO dto) {
EntityManager em = null;
BookDTO outputDTO = new BookDTO();
try {
em = JPAUtil.getEntityManagerFactory().createEntityManager();
outputDTO = em.find(BookDTO.class, dto.getBookCode());
}
finally {
em.close();
}
return outputDTO;
}
@Override
public List<BookDTO> selectAll() {
EntityManager em = null;
List<BookDTO> lstBook = new ArrayList<BookDTO>();
try {
em = JPAUtil.getEntityManagerFactory().createEntityManager();
lstBook= em.createQuery("select b from BookDTO b").getResultList();
}
finally {
em.close();
}
return lstBook;
}
}