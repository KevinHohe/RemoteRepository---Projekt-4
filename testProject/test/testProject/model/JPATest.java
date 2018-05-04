/*
 * Project     : testProject
 * Classname   : JPATest
 * Version     : 1
 * Date        : 03.05.2018 08:30:08
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package testProject.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import Utility.JPAConfig;

/**
 * Klasse yum Testen dittstelle via Java Persistence API (JPA)
 * 
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 03.05.2018 08:30:15 <a href="mailto:david@lippert-familie.de">David
 *        Lippert</a> | Erstellt
 */
public class JPATest {
	/// * ---- Konstante
	/// ------------------------------------------------------------ */
	/// * ---- Attribute
	/// ------------------------------------------------------------ */
	/*
	 * ---- Start ----------------------------------------------------------------
	 */

	/**
	 * @param args
	 * @since 03.05.2018 08:33:17 <a href="mailto:david@lippert-familie.de">David
	 *        Lippert</a> | Erstellt
	 */
	public static void main(String[] args) {
		// Wort wort = new Wort();
		// wort.setRowID(7);
		// wort.setWortSingular("Mach");
		// wort.setWortPlural("Neu");

		JPAConfig.connect();
		EntityManagerFactory factory = JPAConfig.getFactory();
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		Wort wort = new Wort();
		wort.setRowID(7);
		wort.setWortID(7);
		wort.setWortSingular("Yeah");
		wort.setWortPlural("Baby");

		// manager.persist(wort);

		// List<Wort> list = manager.createNamedQuery("Wort.findAll",
		// Wort.class).getResultList();
		// for (Wort worte : list) {
		// System.out.println(worte.getWortPlural());
		// }

		// wort = manager.find(Wort.class, 1);
		// manager.remove(wort);

		manager.merge(wort);
		transaction.commit();

		JPAConfig.close();

	}

	/// * ---- Konstruktor
	/// ---------------------------------------------------------- */
	/// * ---- Initialisierung
	/// ------------------------------------------------------ */
	/// * ---- Logik
	/// ---------------------------------------------------------------- */
	/// * ---- get/is/set/add
	/// ------------------------------------------------------- */
	/// * ---- create
	/// --------------------------------------------------------------- */
}
