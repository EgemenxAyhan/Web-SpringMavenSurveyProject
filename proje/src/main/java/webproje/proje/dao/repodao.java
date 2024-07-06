package webproje.proje.dao;

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import webproje.proje.model.FormData;

 
@Repository
public class repodao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<FormData> rowMapper = new RowMapper<FormData>() {

		public FormData mapRow(ResultSet rs, int rowNum) throws SQLException {
			FormData formData = new FormData();
			formData.setId(rs.getLong("id"));
			formData.setNumericField1(rs.getString("fname"));
			formData.setSurname(rs.getString("lname"));
			formData.setDateField(rs.getObject("dob", LocalDate.class));
			
			return formData;
		}
		
	};
	
	
}