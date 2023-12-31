package se.lexicon.course_manager.dto.forms;




import se.lexicon.course_manager.messages.ValidationMessages;

import javax.validation.constraints.*;

public class UpdateStudentForm {
    @NotNull
    @Positive
    private Integer id;

    @NotBlank(message = ValidationMessages.IS_REQUIRED)
    @Pattern(regexp = "^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$", message = "Not a valid Full name")
    private String name;

    @NotBlank(message = ValidationMessages.IS_REQUIRED)
    @Email(regexp = "^(\\D)+(\\w)*((\\.(\\w)+)?)+@(\\D)+(\\w)*((\\.(\\D)+(\\w)*)+)?(\\.)[a-z]{2,}$", flags = Pattern.Flag.CASE_INSENSITIVE, message = ValidationMessages.NOT_A_VALID_EMAIL_ADDRESS)
    private String email;

    @NotBlank(message = ValidationMessages.IS_REQUIRED)
    @Size(max = 255, message = "Address can't have more than 255 letters")
    private String address;

    public UpdateStudentForm(Integer id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public UpdateStudentForm() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
