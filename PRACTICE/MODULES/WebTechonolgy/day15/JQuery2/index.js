var inputData = []

$('#submit-btn').click(function (e) {
    e.preventDefault();
    let bookName = $('#bname').val();
    let bookAuthor = $('#bauthor').val();
    let bookDate = $('#bdate').val();
    let bookPrice = $('#bprice').val();
    selectedLanuages = []
    $('input[name="languages"]:checked').each(function () {
        selectedLanuages.push($(this).val())
    });
    var obj = {
        bookName: bookName,
        bookAuthor: bookAuthor,
        bookDate: bookDate,
        bookPrice: bookPrice,
        bookLanguage: selectedLanuages
    }
    inputData.push(obj)
    printDetails(obj);
    resetForm()
});

const printDetails = () => {

    $("#Book-Tbody").empty();

    inputData.forEach((element, idx) => {
        $("#Book-Tbody").append(`
            <tr key=${idx}>
                <td>${element.bookName}</td>
                <td>${element.bookAuthor}</td>
                <td>${element.bookDate}</td>
                <td>${element.bookPrice}</td>
                <td>${element.bookLanguage.join(", ")}</td>
            </tr>    
        `);
    });
}

const resetForm = () => {
    $('#bname').val("");
    $('#bauthor').val("");
    $('#bdate').val("");
    $('#bprice').val("");
    $('input[name="languages"]').prop("checked", false);
};
// console.log(inputData);
// console.log(inputData[0].bookLanguage[0].value);
// console.log(inputData[0].bookLanguage[1].value);

// inputData.forEach((element, idx) => {
//     console.log(element[idx].value);
// });