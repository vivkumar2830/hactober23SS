/**
	 * Method encrypt the plain text using AES algorithm.
	 * 
	 * @param plainTextToEncrypt plain text to encrypt.
	 * @param encodedKey         Encoded Secret key to be used in encrypting value.
	 * @param transformation     transformation is a string that describes the
	 *                           operation (or set of operations) to be performed on
	 *                           the given input to produce some output. A
	 *                           transformation always includes the name of a
	 *                           cryptographic algorithm (e.g., AES), and may be
	 *                           followed by a mode and padding scheme.
	 * @return encryted string
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public static String encryptUsingAES(byte[] plainTextToEncrypt, String encodedKey, String transformation)
			throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException,
			BadPaddingException {
		log.info("encryptUsingAES :: Start");
		log.debug("encryptUsingAES :: Start");
		byte[] decodedKey = Base64.getDecoder().decode(encodedKey);

		Key key = new SecretKeySpec(decodedKey, "AES");
		Cipher cipher = Cipher.getInstance(transformation);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedByte = cipher.doFinal(plainTextToEncrypt);
		log.info("encryptUsingAES :: End");
		log.debug("encryptUsingAES :: End");
		return new String(java.util.Base64.getEncoder().encode(encryptedByte));

	}
