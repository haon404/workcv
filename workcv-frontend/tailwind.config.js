/** @type {import('tailwindcss').Config} */
import plugin from "tailwindcss/plugin";

export default {
  content: [],
  theme: {
    extend: {
      colors: {
        "black": "#222323",
        "white": "#f0f6f0",
        "purple": "#ff4adc",
        "green": "#3dff98"
      },
    },
  },
  plugins: [
    plugin(function ({ addVariant }) {
      addVariant("p-active", "&[active=true]");
    }),
  ],
};
