function card_validator(cardNumber){

const prompt = require("prompt-sync")()

let cardNumbers = parseInt(prompt("Enter a string"));
	if(cardNumbers.trim().length == 16){
		return true;
	}
	if(cardNumbers.startsWith("4")){
	return true;
	}
	if(cardNumbers.startsWith("5")){
	return true;
	}
	if(cardNumbers.startsWith("6")){
	return true;
	}
	else{
	return false;
	}

	}

