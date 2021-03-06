// Toast

const elemnsToast = document.querySelector('.toast');
const instanceToast = () => {
	M.toast({
		html: "Evento salvo com sucesso !",
		classes: "blue rounded",
		displayLength: 3000
	})
}


elemnsToast.addEventListener("click", () => {
	instanceToast();
	
	
	//const instanceToast = M.toast({
	//	html: "Evento adicionado com sucesso!!!",
	//	classes: "rounded"
	//})
});


// Chamar Toast

$mdToast.show(
    $mdToast.simple()
        .theme('green')//<-- Segunda parte do truque
        .content('Registro salvo com sucesso')
);

$mdToast.show(
	$mdToast.simple()
		.theme('orange')
		.content('Atenção, preencha os campos obrigatórios')
);

$mdToast.show(
	$mdToast.simple()
		.theme('red')
		.content('Erro a tentar executar a operação XYZ')
);

$mdToast.show(
	$mdToast.simple()
		.theme('blue')
		.content('Você possui uma nova mensagem')
);
