// *********** Change Theme **********

// get the current theme from getter
let currentTheme = getTheme();
// Call the Change theme Function which change the Page color

// caliing method when window is loaded
document.addEventListener("DOMContentLoaded", () => {
  changeTheme(currentTheme);
});

// define the function the change the theme of the page
function changeTheme() {
  // calling the method chnagePageTheme Method that take the old theme Ad Current Theme
  changePageTheme(currentTheme, currentTheme);

  // set the listener to change theme button
  const changeThemeBtn = document.getElementById("theme_change_button");

  // setting the oldtheme to current theme
  const oldTheme = currentTheme;

  // When btn pressed the event triggered
  changeThemeBtn.addEventListener("click", () => {
    if (currentTheme == "dark") {
      currentTheme = "light";
    } else {
      currentTheme = "dark";
    }

    changePageTheme(currentTheme, oldTheme);
  });
}

//Set theme to localstorage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

// Get theme from localstorage
function getTheme() {
  let theme = localStorage.getItem("theme");
  return theme ? theme : "light";
}

//define the function that change the page theme
function changePageTheme(theme, oldTheme) {
  // update in LocalStorage
  setTheme(currentTheme);
  // removing the old theme
  document.querySelector("html").classList.remove(oldTheme);

  document.querySelector("html").classList.add(theme);

  // change the text of button
  document.getElementById("theme-btn-text").textContent =
    theme == "light" ? "Dark" : "Light";
}
