/**
	 * This method is used to decode the base64 encoded string to byte[]
	 * 
	 * @param encodedData : String to decode
	 * @return : decoded String
	 */
	public static byte[] decodeBase64StringToByte(String encodedData) {
		log.info("decodeBase64StringToByte :: Start");
		log.debug("decodeBase64StringToByte :: Start");
		return java.util.Base64.getDecoder().decode(encodedData.getBytes(StandardCharsets.UTF_8));
	}
