
//configurar as credenciais
ClientSecretCredential credential1 = new ClientSecretCredentialBuilder()
     .tenantId(tenantId)
     .clientId(clientId)
     .clientSecret(clientSecret)
     .build();

//obter o client 	 
SecretClient client = new SecretClientBuilder()
      .vaultUrl("https://{YOUR_VAULT_NAME}.vault.azure.net")
      .credential(credentialChain)
      .buildClient();	    

//obter a chave do cofre
KeyClient keyClient = new KeyClientBuilder()
     .vaultUrl("https://myvault.azure.net/")
     .credential(new DefaultAzureCredentialBuilder().build())
     .buildClient();