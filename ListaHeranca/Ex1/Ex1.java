// A classe Ator tem um método abstrato chamado ato(), que será implementado pelas suas subclasses.
//
// AtorFeliz e AtorTriste são subclasses de Ator.
//
// Na classe Palco, temos um atributo ator do tipo Ator que é inicializado com um objeto AtorFeliz. Temos também dois métodos: altera() e atuar().
//
// Quando o método atuar() é executado pela primeira vez, ele chama o método ato() do objeto ator, que é um AtorFeliz, então imprime "Ator feliz".
//
// Depois, executamos o método altera(), que altera o objeto ator para um AtorTriste.
//
// Quando executamos atuar() novamente, agora o método ato() do objeto ator é um AtorTriste, então imprime "Ator triste".

// Os conceitos aplicados são:

// Herança (AtorFeliz e AtorTriste)
// Polimorfismo (A variável ator pode referenciar objetos subtipos)