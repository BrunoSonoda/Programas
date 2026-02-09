import React from "react";
import { Router } from "react-router-dom";
import history from "../src/services/history";

export const CustomRouter = ({ children }) => {
  const [state, setState] = React.useState({
    action: history.action,
    location: history.location,
  });

  React.useLayoutEffect(() => history.listen(setState), []);

  return (
    <Router
      navigationType={state.action}
      location={state.location}
      navigator={history}
    >
      {children}
    </Router>
  );
};
