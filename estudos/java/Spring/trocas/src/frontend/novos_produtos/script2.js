//caso não tenha nada no input, cê não vai colocar o produto
const butao= document.getElementById("#butao");
const jiromba = document.querySelector('#formu');

jiromba.addEventListener("submit",(e)=>{
    e.preventDefault();

    const nome = document.querySelector("#nome");
    const descricao = document.querySelector("#descricao");
    const requer = document.querySelector('#requer');
    

    const va = requer.value;
    const lor= descricao.value;
    const izar= nome.value;

    console.log(va);
    console.log(lor);
    console.log(izar);
});

