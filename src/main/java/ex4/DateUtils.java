package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitaires pour le formatage des dates.
 */
public class DateUtils {

	/** Motif de formatage par défaut. */
	private static final String MOTIF_DEFAULT = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Formate une date en utilisant le motif spécifié.
	 *
	 * @param pattern le motif de formatage de la date
	 * @param date    la date à formater
	 * @return la date formatée en chaîne de caractères
	 */
	public static String format(String pattern, Date date) {
		return formatDate(pattern, date);
	}

	/**
	 * Formate une date en utilisant le motif par défaut "dd/MM/yyyy HH:mm:ss".
	 *
	 * @param date la date à formater
	 * @return la date formatée en chaîne de caractères
	 */
	public static String formatDefaut(Date date) {
		return formatDate(MOTIF_DEFAULT, date);
	}

	/**
	 * Formate la date en utilisant le motif spécifié.
	 *
	 * @param pattern le motif de formatage de la date
	 * @param date    la date à formater
	 * @return la date formatée en chaîne de caractères
	 */
	private static String formatDate(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
}
