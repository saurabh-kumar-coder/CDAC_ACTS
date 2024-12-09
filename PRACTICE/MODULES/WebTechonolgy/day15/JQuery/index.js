$('.clk-me-btn').click(function (e) {
    e.preventDefault();
    $('.bg-green').css("display", "block");
    $('.bg-yellow').css("display", "none");
});

$(".bg-green").mouseover(function (e) {
    e.preventDefault();
    $('.hover-box').css("display", "block");
    $('.bg-green').css("display", "none")

});