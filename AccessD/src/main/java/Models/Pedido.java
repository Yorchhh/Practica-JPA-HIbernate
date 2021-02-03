package Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pedido")
public class Pedido implements Serializable{
	@Id
	@Column(name="codigo_pedido")
	private int codigo_pedido;
	@Column(name="fecha_pedido")
	private Date fecha_pedido;
	@Column(name="fecha_esperada")
	private Date fecha_esperada;
	@Column(name="fecha_entrega")
	private Date fecha_entrega;
	@Column(name="estado")
	private String estado;
	@Column(name="comentarios")
	private String comentarios;
	@Column(name="codigo_cliente")
	private int codigo_cliente;
	public Pedido() {
		
	}
	public Pedido(int codigo_pedido, Date fecha_pedido, Date fecha_esperada, Date fecha_entrega, String estado,
			String comentarios, int codigo_cliente) {
		super();
		this.codigo_pedido = codigo_pedido;
		this.fecha_pedido = fecha_pedido;
		this.fecha_esperada = fecha_esperada;
		this.fecha_entrega = fecha_entrega;
		this.estado = estado;
		this.comentarios = comentarios;
		this.codigo_cliente = codigo_cliente;
	}
	public int getCodigo_pedido() {
		return codigo_pedido;
	}
	public void setCodigo_pedido(int codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}
	public Date getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public Date getFecha_esperada() {
		return fecha_esperada;
	}
	public void setFecha_esperada(Date fecha_esperada) {
		this.fecha_esperada = fecha_esperada;
	}
	public Date getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public int getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	@Override
	public String toString() {
		return "Pedido=" + codigo_pedido + ", fecha_pedido=" + fecha_pedido + ", fecha_esperada="
				+ fecha_esperada + ", fecha_entrega=" + fecha_entrega + ", estado=" + estado + ", comentarios="
				+ comentarios + ", codigo_cliente=" + codigo_cliente;
	}
	
	
	

}
