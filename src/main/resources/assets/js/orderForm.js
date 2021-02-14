var max = 500;
var textArea = $(".napomena");
var wordsLeft = $(".duzina-poruke");

function maxWords(){
    let currentWords = textArea.val().length;
    wordsLeft.html(max-currentWords);
}