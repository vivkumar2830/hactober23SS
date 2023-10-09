/**
	 * This method is used to encode bytes[] to base64 string.
	 * 
	 * @param byteData : Bytes to encode
	 * @return : Encoded Base64 String
	 */
	public static String encodeBase64String(byte[] byteData) {
		log.info("encodeBase64String :: Start");
		log.debug("encodeBase64String :: Start");
		return new String(java.util.Base64.getEncoder().encode(byteData));
	}
