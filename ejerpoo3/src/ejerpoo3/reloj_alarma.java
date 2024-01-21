package ejerpoo3;

public class reloj_alarma {

			

		public class alarma_reloj {

			
				// TODO Auto-generated method stub
				

			private String hora_actual;
			private String hora_alarma;
			private boolean alarma_activada;
			
			public alarma_reloj() {
					this.hora_actual= null;
					this.hora_alarma= null;
					this.alarma_activada=false;
					
			}
			public void hora_alarma_ahora(String hora) {
				this.hora_actual=hora;
			}
			public void activarla() {
				this.alarma_activada= true;
				
			}
			public void desactivarla() {
				this.alarma_activada=false;
			}
			public void poner_hora(String hora) {
				this.hora_alarma=hora;
			}
			public void alarmaa(String hora_alarma) {
				if (alarma_activada && hora_alarma.equals(hora_actual)) {
					System.out.println("Suena la alarma");
				}
			}
			}




	}

}
