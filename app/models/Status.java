package models;

public enum Status {
	New{
		public String toString() {
			return "Nouvelle Offre";
		}
	},
	Applied {
		public String toString() {
			return "Candidature Envoyée";
		}
	},
	Interview_Scheduled {
		public String toString() {
			return "Entretien Prévu";
		}
	}
	,
	Declined {
		public String toString() {
			return "Candidature Refusée";
		}
	}
}

