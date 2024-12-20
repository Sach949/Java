public class SchoolAdmission {

    private String studentName;
    private int age;
    private String gender;
    private String grade;
    private String address;
    private String contactNumber;
    private String guardianName;
    private String guardianContact;
    private String schoolName;
    private String admissionDate;
    private String parentOccupation;
    private String studentEmail;
    private String dateOfBirth;
    private String previousSchool;
    private String preferredLanguage;
    private String admissionStatus;
    private String specialNeeds;
    private boolean siblingInSchool;
    private String extraCurricularInterests;
    private String medicalConditions;
    
    
     
    public SchoolAdmission() {
        System.out.println("Default constructor");
    }

    public SchoolAdmission(String studentName, int age, String gender, String grade, String address, String contactNumber,
                           String guardianName, String guardianContact, String schoolName, String admissionDate,
                           String parentOccupation, String studentEmail, String dateOfBirth, String previousSchool,
                           String preferredLanguage, String admissionStatus, String specialNeeds, boolean siblingInSchool,
                           String extraCurricularInterests, String medicalConditions) {
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.address = address;
        this.contactNumber = contactNumber;
        this.guardianName = guardianName;
        this.guardianContact = guardianContact;
        this.schoolName = schoolName;
        this.admissionDate = admissionDate;
        this.parentOccupation = parentOccupation;
        this.studentEmail = studentEmail;
        this.dateOfBirth = dateOfBirth;
        this.previousSchool = previousSchool;
        this.preferredLanguage = preferredLanguage;
        this.admissionStatus = admissionStatus;
        this.specialNeeds = specialNeeds;
        this.siblingInSchool = siblingInSchool;
        this.extraCurricularInterests = extraCurricularInterests;
        this.medicalConditions = medicalConditions;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }
    
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getParentOccupation() {
        return parentOccupation;
    }

    public void setParentOccupation(String parentOccupation) {
        this.parentOccupation = parentOccupation;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPreviousSchool() {
        return previousSchool;
    }

    public void setPreviousSchool(String previousSchool) {
        this.previousSchool = previousSchool;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public boolean isSiblingInSchool() {
        return siblingInSchool;
    }

    public void setSiblingInSchool(boolean siblingInSchool) {
        this.siblingInSchool = siblingInSchool;
    }

    public String getExtraCurricularInterests() {
        return extraCurricularInterests;
    }

    public void setExtraCurricularInterests(String extraCurricularInterests) {
        this.extraCurricularInterests = extraCurricularInterests;
    }

    public String getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    @Override
    public String toString() {
        return "----SchoolAdmission---" +
                "\nStudent Name: " + getStudentName() +
                "\nAge: " + getAge() +
                "\nGender: " + getGender() + 
                "\nGrade: " + getGrade() + 
                "\nAddress: " + getAddress() + 
                "\nContact Number: " + getContactNumber() +
                "\nGuardian Name='" + getGuardianName() +
                "\nGuardian Contact: " + getGuardianContact() + 
                "\nSchool Name: " + getSchoolName() +
                "\nAdmission Date: " + getAdmissionDate() + 
                "\nParent Occupation: " + getParentOccupation() + 
                "\nStudent Email: " + getStudentEmail() + 
                "\nDate Of Birth: " + getDateOfBirth() +
                "\nPrevious School: " + getPreviousSchool() +
                "\nPreferred Language: " + getPreferredLanguage() +
                "\nAdmission Status: " + getAdmissionStatus() +
                "\nSpecial Needs: " + getSpecialNeeds() +
                "\nSibling In School: " + isSiblingInSchool() +
                "\nExtra Curricular Interests: " + getExtraCurricularInterests() + 
                "\nMedical Conditions: " + getMedicalConditions();
    }
    
    public boolean equals(Object anotherObj){
        System.out.println("Another object: "+anotherObj);
        System.out.println("This: "+this);
        
        if(anotherObj == null){
            return false;
        }
        if(anotherObj ==this){
            return true;
        }
        if(this.getClass() != anotherObj.getClass()){
            return false;
        }
        
        SchoolAdmission admission = (SchoolAdmission)anotherObj;
        if(admission.getStudentName() != null){
            if(!this.getStudentName().equals(admission.getStudentName())){
                return false;
            }
            if(!this.getGuardianName().equals(admission.getGuardianName())){
                return false;
            }
            if(!this.getSchoolName().equals(admission.getSchoolName())){
                return false;
            }
        }
        
        
        
        return false;
    }
}