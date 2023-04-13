package com.itsolutioncompany.consultartercero.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itsolutioncompany.consultartercero.bean.PersonaNaturalBean;
import com.itsolutioncompany.consultartercero.interfaces.PersonaNaturalDAO;
import com.itsolutioncompany.consultartercero.utils.ConexionBD;

public class MysqlPersonaNatural implements PersonaNaturalDAO {

	CallableStatement cs = null;
	Connection cn = null;
	ResultSet rs = null;
	PersonaNaturalBean objPersonaNaturalBean = null;
	List<PersonaNaturalBean> listaPersonaNaturalBean = null;

	@Override
	public List<PersonaNaturalBean> totalPersonaNatural() {

		listaPersonaNaturalBean = new ArrayList<PersonaNaturalBean>();

		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "{call sp_listaPersonaNaturalCorros01()}";
			cs = cn.prepareCall(sql);
			rs = cs.executeQuery();
			while (rs.next()) {
				
				objPersonaNaturalBean = new PersonaNaturalBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));			
				
				listaPersonaNaturalBean.add(objPersonaNaturalBean);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en totalPersonaNatural : " + e.getMessage());
		} finally {
			try {

				rs.close();
				cs.close();
				cn.close();

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error en Cerrar Conexion en totalPersonaNatural : " + e.getMessage());

			}
		}

		return listaPersonaNaturalBean;
	}

	@Override
	public PersonaNaturalBean consultarPersonaNaturalNUNDOC(String NUNDOC) {

		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "{call sp_consultarpersonanaturalnumdoc(?)}";
			cs = cn.prepareCall(sql);
			cs.setString(1, NUNDOC);
			rs = cs.executeQuery();
			while (rs.next()) {
				objPersonaNaturalBean = new PersonaNaturalBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));		

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en consultarPersonaNaturalNUNDOC : " + e.getMessage());
		} finally {
			try {

				rs.close();
				cs.close();
				cn.close();

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error en Cerrar Conexion en consultarPersonaNaturalNUNDOC : " + e.getMessage());

			}
		}

		return objPersonaNaturalBean;
	}

	@Override
	public PersonaNaturalBean consultarPersonaNaturalID(int ID) {
		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "{call sp_consultarpersonanaturalid(?)}";
			cs = cn.prepareCall(sql);
			cs.setInt(1, ID);
			rs = cs.executeQuery();
			while (rs.next()) {
				objPersonaNaturalBean = new PersonaNaturalBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));		

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en consultarPersonaNaturalID : " + e.getMessage());
		} finally {
			try {

				rs.close();
				cs.close();
				cn.close();

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error en Cerrar Conexion en consultarPersonaNaturalID : " + e.getMessage());

			}
		}

		return objPersonaNaturalBean;
	}

	@Override
	public List<PersonaNaturalBean> consultarpersonanaturalnombres(String nombres) {
		listaPersonaNaturalBean = new ArrayList<PersonaNaturalBean>();

		try {

			ConexionBD cnx = new ConexionBD();
			cn = cnx.getConeccionBD();
			String sql = "{call sp_consultarpersonanaturalnombres(?)}";
			cs = cn.prepareCall(sql);
			cs.setString(1, nombres.toUpperCase());
			rs = cs.executeQuery();
			while (rs.next()) {
				
				objPersonaNaturalBean = new PersonaNaturalBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));			
				
				listaPersonaNaturalBean.add(objPersonaNaturalBean);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en consultarpersonanaturalnombres : " + e.getMessage());
		} finally {
			try {

				rs.close();
				cs.close();
				cn.close();

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error en Cerrar Conexion en consultarpersonanaturalnombres : " + e.getMessage());

			}
		}

		return listaPersonaNaturalBean;
	}

}
