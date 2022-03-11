package fr.eni.javaee.messages;

import java.util.ResourceBundle;

public abstract class LectureMessages {
		private static ResourceBundle rb;
		
		static
		{
			try
			{
				rb = ResourceBundle.getBundle("fr.eni.javaee.messages.MessagesErreurs.properties");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		/**
		 * @param code
		 * @return
		 */
		public static  String getMessagesErreurs(int code)
		{
			String message="";
			try
			{
				if(rb!=null)
				{
					message = rb.getString(String.valueOf(code));
				}
				else
				{
					message="Problème à la lecture du fichier contenant les messages";
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				message="Une erreur inconnue est survenue";
			}
			return message;
		}
	}
