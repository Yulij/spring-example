$(document).ready(function () {
	$('#addPerson').click(function () {
		addPerson();
	});
	$('#deletePerson').click(function () {
		deletePerson();
	});
	$('#personAdd').click(function () {
		addProduct();
	});
	$('#personUpdate').click(function () {
		updateProduct();
	});
	$('#personDelete').click(function () {
		deleteProduct();
	});
});

function addPerson() {
	$('#personForm').prop('action', 'add');
	$('#personButton').prop('value', 'Add person');
	$('#personForm').show();
}

function deletePerson() {
	$('#personForm').prop('action', 'delete');
	$('#personButton').prop('value', 'Delete person');
	$('#personForm').show();
}

function addProduct() {
    var name = $("#name").val();
    var surname = $("#surname").val();
    var age = $("#age").val();
    if (name && surname && age) {
        var person = {
            name: name,
            surname: surname,
            age: age
        };
        $.ajax({
            data:person,
            dataType: "json",
            type:'post',
            url: restUrl
        }).done(function(data) {
            var el = '<div id="' + data.id + '">'+ data.name +'    '+data.surname+'    '+data.age+'</div>';
            $(".personTable").append(el);
        }).fail(function(data){
            if ( console && console.log ) {
                console.log( "Error data:", data);
            }
        });
    }
}