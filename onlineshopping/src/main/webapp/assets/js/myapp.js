$(function() {
	// solving the active menu problem
	console.log('hi i m loading');
	console.log($('#about'));
	switch (window.menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

});
