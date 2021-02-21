var max = 1000;
var textArea = $(".polje");
var wordsLeft = $(".broj-reci");

function maxWords() {
    let currentWords = textArea.val().length;
    wordsLeft.html(max-currentWords);
}