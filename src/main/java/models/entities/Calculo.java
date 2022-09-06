package models.entities;

public class Calculo {
	private Long id;
	private TipoJuros tipo;
	private Double valorPrincipal;
	private Double taxa;
	private int meses;
	private Double montante;
	private Double totalJuros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoJuros getTipo() {
		return tipo;
	}

	public void setTipo(TipoJuros tipo) {
		this.tipo = tipo;
	}

	public Double getValorPrincipal() {
		return valorPrincipal;
	}

	public void setValorPrincipal(Double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}

	public Double getTotalJuros() {
		return totalJuros;
	}

	public void setTotalJuros(Double totalJuros) {
		this.totalJuros = totalJuros;
	}
	
    @Override
    public String toString() {
        return "Calculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", valorPrincipal=" + valorPrincipal +
                ", taxa=" + taxa +
                ", meses=" + meses +
                ", montante=" + montante +
                ", totalJuros=" + totalJuros +
                '}';
    }

	public enum TipoJuros {
		SIMPLES(1, "Juros Simples"),
		COMPOSTOS(2, "Juros Compostos");
		
		private int valor;
		private String descricao;
		
		TipoJuros(int valor, String descricao) {
			this.valor = valor;
			this.descricao = descricao;
		}
		
		public int getValor() {
			return valor;
		}
		
		public String getDescricao() {
			return descricao;
		}
	}
}
