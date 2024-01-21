package ejerpoo3;

public class uso_habitacion_hotel {
	


	

		public class habitacion_hotel {

			private int numHabi;
			private String tipoHabi;
			private Boolean libre = true;
			private int ocupadas[] = new int[10];
			private String tipoOcupadas[] = new String[10];

			public void habitacion(int numHabi, String habiTipo) {
				this.numHabi = numHabi;
				this.tipoHabi = tipoHabi;
				this.libre = false;
				for (int i = 0; i < ocupadas.length; i++) {
					if (ocupadas[i] == 0) {
						ocupadas[i] = numHabi;
						tipoOcupadas[i] = tipoHabi;
						break;
					} else if (ocupadas[i] == this.numHabi) {
						System.out.println("ESTA HABITACION YA ESTA OCUPADA");
						break;
					}
				}

			}

			public void verHabi(int numHabi) {
				for (int i = 0; i < ocupadas.length; i++) {
					if (ocupadas[i] == this.numHabi) {
						System.out.println("HABITACION OCUPADA");
					} else {
						System.out.println("HABITACION LIBRE");
					}
				}
			}

			public void cancela(int numHabi) {
				for (int i = 0; i < ocupadas.length; i++) {
					if (ocupadas[i] == this.numHabi) {
						ocupadas[i] = 0;
						System.out.println("RESERVA CANCELADA");
						break;
					} else {
						System.out.println("RESERVA NO ENCONTRADA");
						break;
					}
				}
			}

			public void disponibilidad() {
				System.out.println("ESTAS SON LAS HABITACIONES OCUPADAS");
				for (int i = 0; i < ocupadas.length; i++) {
					System.out.print(ocupadas[i] + " "+ tipoOcupadas[i]);
				}
			}

			public String resumen() {
				return "Has reservado la habitacion numero " + numHabi + " del tipo " + tipoHabi;
			}

		}
	}


