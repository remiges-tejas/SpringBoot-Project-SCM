/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/main/resources/templates/**/*.{html,htm,twig}",
    "./src/main/resources/static/**/*.{html,htm,twig}",
  ],
  theme: {
    extend: {},
  },
  plugins: [],
  darkMode: "selector",
};
