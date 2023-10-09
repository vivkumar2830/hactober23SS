/**
	 * Method decrypts the value sent to it using AES algorithm.
	 * 
	 * @param text           Encrypted text which needs to be decrypted using key
	 * @param secret         Key which needs to be used for decrypting the value.
	 * @param transformation transformation is a string that describes the operation
	 *                       (or set of operations) to be performed on the given
	 *                       input to produce some output. A transformation always
	 *                       includes the name of a cryptographic algorithm (e.g.,
	 *                       AES), and may be followed by a mode and padding scheme.
	 * @return Byte array of decrypted string.
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public static byte[] decryptUsingAES(String text, String secret, String transformation) throws InvalidKeyException,
			NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		log.info("decryptUsingAES :: Start");
		log.debug("decryptUsingAES :: Start");
		byte[] key = java.util.Base64.getDecoder().decode(secret.getBytes(StandardCharsets.UTF_8));
		SecretKeySpec sk = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance(transformation);
		cipher.init(Cipher.DECRYPT_MODE, sk);
		log.info("decryptUsingAES :: End");
		log.debug("decryptUsingAES :: End");
		return cipher.doFinal(java.util.Base64.getDecoder().decode(text.getBytes(StandardCharsets.UTF_8)));
	}
