# Atelier1_5JEE
Travail à faire:
Cette activité m'a permis de comprendre comment créer et utiliser un web service SOAP en utilisant JaxWS.
https://www.youtube.com/watch?v=ig5UHI12HPs
      ![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/048f33e9-6b5c-4a44-b457-3a790db9a05d)

# WEB SERVICE SOAP:
Un web service SOAP, abréviation de "Simple Object Access Protocol," est un protocole de communication utilisé pour permettre à des applications informatiques de communiquer sur un réseau, généralement via Internet. Les web services SOAP sont basés sur un ensemble de règles et de normes qui définissent comment les messages doivent être structurés et échangés entre les applications.

Les caractéristiques principales des web services SOAP incluent :

Format de message : Les messages sont généralement formatés en utilisant le langage XML (eXtensible Markup Language), ce qui permet une structuration hiérarchique et une lisibilité pour les ordinateurs et les humains.

Protocole de transport : Les web services SOAP peuvent utiliser différents protocoles de transport pour acheminer les messages, y compris HTTP, SMTP, FTP, etc. HTTP est le protocole le plus couramment utilisé pour les web services SOAP, ce qui les rend généralement accessibles via des requêtes HTTP standard.

Encapsulation : Les messages SOAP sont encapsulés dans un format XML, ce qui permet d'inclure des informations sur la structure du message, les erreurs possibles, les métadonnées, etc.

Interopérabilité : Les web services SOAP sont conçus pour être interopérables, ce qui signifie qu'ils peuvent être utilisés avec des technologies et des langages de programmation différents. Cela est rendu possible grâce à la normalisation des spécifications SOAP.

Sécurité : SOAP offre des options pour la sécurité des messages, notamment la possibilité de chiffrer et de signer les données pour garantir leur confidentialité et leur intégrité.

# WSDL:
WSDL est l'acronyme de "Web Services Description Language," qui signifie en français "Langage de Description des Services Web." Il s'agit d'un format XML standard utilisé pour décrire les fonctionnalités offertes par un service web, ainsi que la manière dont ces fonctionnalités peuvent être invoquées. En d'autres termes, WSDL fournit une description formelle et structurée des opérations, des types de données, des protocoles de communication, et d'autres informations essentielles sur un service web.

Voici quelques éléments clés que l'on retrouve généralement dans un document WSDL :

Interface du service : WSDL décrit les opérations offertes par le service web, y compris leur nom, les types de données qu'elles acceptent en entrée et renvoient en sortie, ainsi que les éventuelles exceptions.

Protocoles de communication : Il spécifie les protocoles de transport pris en charge par le service web. Cela peut inclure des protocoles comme HTTP, SMTP, etc.

Localisation : Il indique l'emplacement physique (URL, point de terminaison) du service web, ce qui permet aux clients de savoir où trouver et accéder au service.

Types de données : WSDL définit les types de données personnalisés utilisés dans les messages échangés entre le client et le service. Ces types de données sont généralement définis à l'aide de schémas XML.

# UDDI:
UDDI, ou "Universal Description, Discovery, and Integration," est un protocole et un registre de services web qui a été conçu pour faciliter la découverte et la publication de services web sur Internet. UDDI est un élément important de l'architecture des services web et était largement promu dans les premiers jours du développement des services web pour améliorer l'interopérabilité et la découverte des services en ligne.

Voici les principaux concepts associés à UDDI :

Description (Description) : Le registre UDDI permet aux fournisseurs de services web de publier des descriptions détaillées de leurs services, y compris des informations sur les opérations offertes, les types de données utilisés, les protocoles pris en charge, etc. Ces descriptions sont stockées dans un format XML standard.

Découverte (Discovery) : Les utilisateurs, qu'ils soient des développeurs ou des entreprises, peuvent interroger le registre UDDI pour rechercher des services web répondant à leurs besoins. Ils peuvent spécifier des critères de recherche pour trouver les services qui correspondent à leurs besoins.

Intégration (Integration) : Une fois qu'un utilisateur a identifié un service web approprié, UDDI fournit les informations nécessaires pour contacter et utiliser ce service. Cela peut inclure des détails sur l'emplacement du service (URL, point de terminaison), les informations sur les opérations, et les protocoles de communication.

  ![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/62f3afc9-fede-4c92-967b-d2297aba2e50)
  UDDI est un registre où les descriptions de services web, généralement au format WSDL, sont publiées. Les clients peuvent utiliser UDDI pour découvrir des services web qui répondent à leurs besoins. Une fois qu'un service web est découvert, les clients peuvent consulter le document WSDL pour comprendre comment communiquer avec ce service, y compris la structure des messages SOAP qui doivent être échangés.

# JAX-WS:
JAX-WS (Java API for XML Web Services) est une API Java qui permet de créer et de consommer des services web basés sur le protocole SOAP (Simple Object Access Protocol). JAX-WS fait partie de la plateforme Java EE (Enterprise Edition) et fournit un ensemble d'outils et de classes pour faciliter le développement de services web en utilisant le langage de programmation Java.

# Convert
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/f510f523-2439-4b4b-8bf1-16263cff8f79)
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/b3477f9a-5b21-4ebf-9ff6-ee5422ab2a56)

# GetCompte
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/2084fe20-80cc-4f79-9293-2cadefde9689)
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/1306092e-f39e-44d8-84bf-80f474b94a5e)

# ListCompte
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/1ff55847-127f-4930-814a-e371411c7db4)
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/d4b7a460-019e-4039-964e-28239536a4e4)

# GetCompte après l'annotation @XmlTransient sur la date
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/86726062-d317-4a21-9f43-9e796fbd1bd7)
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/bafaa749-b172-43eb-ad0b-88c4d3427aa2)

# Consommation du web service par le client
Il faut génerer le code java en créant un Proxy,en lui fournissant le wsdl
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/a2b37333-0a45-46a0-8b17-8c47b67eed86)
![image](https://github.com/Moujoudrana/Atelier1_5JEE/assets/93864104/999a0022-e220-4727-a651-87c8e492a3d9)










