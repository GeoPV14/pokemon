package com.pokemon.bean;

public class PiedraBean {
		private int idFormaEvolucion;
		private int idTipoPiedra;
		
		public PiedraBean() {
			super();
		}

		public PiedraBean(int idFormaEvolucion, int idTipoPiedra) {
			super();
			this.idFormaEvolucion = idFormaEvolucion;
			this.idTipoPiedra = idTipoPiedra;
		}

		public int getIdFormaEvolucion() {
			return idFormaEvolucion;
		}

		public void setIdFormaEvolucion(int idFormaEvolucion) {
			this.idFormaEvolucion = idFormaEvolucion;
		}

		public int getIdTipoPiedra() {
			return idTipoPiedra;
		}

		public void setIdTipoPiedra(int idTipoPiedra) {
			this.idTipoPiedra = idTipoPiedra;
		}
		
		

}
