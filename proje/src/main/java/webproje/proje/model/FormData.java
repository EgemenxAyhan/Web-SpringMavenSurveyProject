package webproje.proje.model;

import java.time.LocalDate; 

import java.util.List;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "person")
public class FormData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Size(min = 2, max = 50)
    private String numericField1;

	@Size(min = 2, max = 50)
    @NotEmpty
    private String surname;

    @Email
    private String email;
    
    @Email
    private String confirmEmail;

    @Min(value=16)
    private Integer age;
    
    @DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateField;

    private String role;

    
    private String recommend;
    
    private String submit;
    
    
    private List<String> checkboxSelection;


    
    public long getId() {
		return Id;
	}

	public void setId(long Id) {
		this.Id = Id;
	}

    @Size(min=1,max = 500)
    private String comment;

    // Getters and Setters
    public String getNumericField1() {
        return numericField1;
    }

    public void setNumericField1(String numericField1) {
        this.numericField1 = numericField1;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateField() {
        return dateField;
    }

   
    public void setDateField(LocalDate dateField) {
        this.dateField = dateField;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
    public List<String> getCheckboxSelection() {
		return checkboxSelection;
	}

	public void setCheckboxSelection(List<String> checkboxSelection) {
		this.checkboxSelection = checkboxSelection;
	}

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
}
