package Beans;

public class personne {
	private String nomPersonne;
	private String prenomPersonne;
	private String sexeP;
	private String TelP;
	private String emailP;
	private String passwordP;
        private String type_personne;
        private vehicule matricule;
	public personne(String nomPersonne, String prenomPersonne, String sexeP, String telP,
			String emailP, String passwordP,String type_personne) {
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.sexeP = sexeP;
		TelP = telP;
		this.emailP = emailP;
		this.passwordP = passwordP;
                this.type_personne=type_personne;
	}

    public String getType_personne() {
        return type_personne;
    }

    public void setType_personne(String type_personne) {
        this.type_personne = type_personne;
    }
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomPersonne() {
		return prenomPersonne;
	}
	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}
	public String getSexeP() {
		return sexeP;
	}
	public void setSexeP(String sexeP) {
		this.sexeP = sexeP;
	}
	public String getTelP() {
		return TelP;
	}
	public void setTelP(String telP) {
		TelP = telP;
	}
	public String getEmailP() {
		return emailP;
	}
	public void setEmailP(String emailP) {
		this.emailP = emailP;
	}
	public String getPasswordP() {
		return passwordP;
	}
	public void setPasswordP(String passwordP) {
		this.passwordP = passwordP;
	}
}
