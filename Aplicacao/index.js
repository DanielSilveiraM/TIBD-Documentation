let divCarInd = document.getElementById('car_indicator'),
    divCarImgs = document.getElementById('car_imgs'),
    divCarInst = document.getElementById('inst_carrossel');

let instituicoes, carousel;

if(load_instsData() == 200) load_InstsCarousel();
if(load_carouselData() == 200) load_Carousel();

// ----------------------------------------------------------------------------------------------------------------------------------- //

function setClickInst(id) 
{
    sessionStorage.setItem('id_clickInst', id);
    location.href = "page_cadastroUsuario.html";
}

// ----------------------------------------------------------------------------------------------------------------------------------- //

function load_instsData()
{
    $.ajax({

        async: false,
        url: 'http://localhost:6587/institutions',
        method: 'GET',

        success: function(result, json, data) { 
            
            instituicoes = JSON.parse(result);

            // ---------------------- //

            response = data.status;
        },

        error: function(req, status, error) { response = req.status; }
    })
    return response;
}
