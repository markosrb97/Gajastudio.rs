var slideIndex = 0;
var menuSwitch = 0;
showSlides();

/* Update za mobile */
$(window).resize(function() {
  if( $(this).width() > 770 ) {
    document.getElementById('menu-list').removeAttribute("style");
  }
});
/* ---------------- */

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}
  slides[slideIndex-1].style.display = "block";
  setTimeout(showSlides, 7000); // Change image every 2 seconds
}
/* Update za mobile */
function menuShowHide() {
  
  if (menuSwitch == 0) {
    $("#menu-list").slideDown();
    menuSwitch = 1;
  } else {
    $("#menu-list").slideUp();
    menuSwitch = 0;
  }
  
}
 /* ---------------- */