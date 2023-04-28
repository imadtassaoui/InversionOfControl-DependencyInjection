<h2>Principe de l’Inversion de Contrôle et
Injection des dépendances</h2>

<h3>L’Inversion de contrôle :</h3>
<p>• Permettre au développeur de s’occuper uniquement du code métier (Exigences
fonctionnelles) et c’est le Framework qui s’occupe du code technique (Exigences Techniques)</p>

<h3>L’Injection des dépendances :</h3>
<p>• Une application doit évoluer dans le temps <br>
• L’application doit être fermée à la modification et ouverte à l’extension <br>
• Avec le <b>couplage faible</b>, nous pourrons créer des application fermée à la modification et ouvertes à
l’extension.</p>

<h4>Le Couplage faible :</h4>
<p>• Pour utiliser le couplage faible, nous devons utiliser les interfaces.
• Considérons une classe A qui implémente une interface IA, et une classe B qui implémente une interface IB. <br>
• Si la classe A est liée à l’interface IB par une association, on dit que le classe A et la classe B sont liées par un
couplage faible. <br>
• Cela signifie que la classe B peut fonctionner avec n’importe quelle classe qui implémente l’interface IA. <br>
• En effet la classe B ne connait que l’interface IA. De ce fait n’importe quelle classe implémentant cette
interface peut être associée à la classe B, sans qu’il soit nécéssaire de modifier quoi que se soit dans la
classe B.</p>

<h3>l'interface daoInterface avec une méthode getDate</h3>
<img src="Screenshots/daoInterface.png" alt="">

<h3>Une implémentation de cette interface (daoImplementation)</h3>
<img src="Screenshots/daoImplementation.png" alt="">

<h3>l'interface metierInterface avec une méthode calcul</h3>
<img src="Screenshots/metierInterface.png" alt="">

<h3>Une implémentation de cette interface en utilisant le couplage faible (metierImplementation)</h3>
<img src="Screenshots/metierImplementation.png" alt="">

<h3>L’Injection des dépendances par :</h3>

<h4> 1) Instanciation Statique :</h4>
<img src="Screenshots/presStatic.png" alt="">

<h4> 2) Instanciation Dynamique :</h4>
<h5>config.txt est un fichier contenant les noms des classes souhaitant instancier.</h5>
<img src="Screenshots/presDynamic.png" alt="">

<h5> A - Premier Résultat :</h5>
<img src="Screenshots/first_version_result.png" alt="">

<h5> B - Deuxième Résultat :</h5>
<h5>Création d'une deuxième implémantation de l'interface daoInterface.</h5>
<img src="Screenshots/daoImplementation2.png" alt="">
<h5>Changement du fichier config.txt</h5>
<img src="Screenshots/second_version_result.png" alt="">

<h4> 3) Framework Spring :</h4>
<h5> A - Version XML :</h5>
<h5>applicationContext.xml est un fichier contenant les beans souhaitant instancier.</h5>
<img src="Screenshots/presSpringXml.png" alt="">

<h5> Aa - Premier Résultat :</h5>
<img src="Screenshots/first_version_xml.png" alt="">

<h5> Ab - Deuxième Résultat :</h5>
<img src="Screenshots/second_version_xml.png" alt="">

<h5> B - Version Annotations :</h5>
<h5>L'ajout d'une annotation "@Component" dans la classe metierImplementation, ainsi que l'ajout d'un constructeur à la place de "@Autowired".</h5>
<img src="Screenshots/Annotation_method.png" alt="">

<img src="Screenshots/presSpringAnnotations.png" alt="">

